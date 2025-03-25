package com.ltnhung.noiseapp.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.IOException;

@Configuration
public class FirebaseConfig {
//    @Bean
//    public FirebaseApp initializeFirebase() throws IOException {
//        FileInputStream serviceAccount = new FileInputStream("src/main/resources/key_private_firebaseaccount.json");
//
//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .setDatabaseUrl("https://noiseapp-ac53c-default-rtdb.asia-southeast1.firebasedatabase.app/")
//                .build();
//
//        FirebaseApp firebaseApp = null;
//        if (FirebaseApp.getApps().isEmpty()) {
//            firebaseApp = FirebaseApp.initializeApp(options);
//        } else {
//            firebaseApp = FirebaseApp.getInstance();
//        }
//        return firebaseApp;
//    }
}
