package com.ltnhung.noiseapp.service;

import com.google.firebase.database.*;
import com.ltnhung.noiseapp.entity.NoiseData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@Service
public class FirebaseService {
    public List<NoiseData> getNoiseData() throws InterruptedException {
            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("noise_data");
        List<NoiseData> noiseDataList = new ArrayList<>();
        CountDownLatch latch = new CountDownLatch(1);

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    NoiseData noiseData = snapshot.getValue(NoiseData.class);
                    noiseDataList.add(noiseData);
                }
                latch.countDown();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                latch.countDown();
            }
        });

        latch.await();
        return noiseDataList;
    }
}
