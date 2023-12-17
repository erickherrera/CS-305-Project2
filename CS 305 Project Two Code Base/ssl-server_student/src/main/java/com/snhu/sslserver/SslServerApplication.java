package com.snhu.sslserver;

import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
}

//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ChecksumController {
	@RequestMapping("/checksum")    
	@GetMapping("/calculate")
    public String calculateChecksum() {
        String data = "Erick Herrera Check Sum!";
        String checksum = calculateChecksum(data);
        return "<p>Data: "+ data + "<br>SHA-256: " + checksum;
    }
    
    private String calculateChecksum(String data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(data.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array to a hexadecimal string
            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : hashBytes) {
                hexStringBuilder.append(String.format("%02x", b));
            }
            return hexStringBuilder.toString();
        } catch (Exception e) {
        	e.printStackTrace();
            return "Error calculating hash";
        }
    }
}