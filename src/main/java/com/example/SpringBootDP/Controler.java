package com.example.SpringBootDP;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class Controler {
    @GetMapping("/subscriber")
    public JsonNode subscriber() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/Subscriber.json"));
        return jsonNode;
    }

    @GetMapping("/serviceAndUsage")
    public JsonNode serviceAndUsage() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/ServicesAndUsage.json"));
        return jsonNode;
    }

    @GetMapping("/appSlots")
    public JsonNode appSlots() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/appSlots.json"));
        return jsonNode;
    }

    @GetMapping("/bonusSlots")
    public JsonNode bonusSlots() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/bonusSlots.json"));
        return jsonNode;
    }

    @GetMapping("/productPromotions")
    public JsonNode productPromotions() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/productPromotions.json"));
        return jsonNode;
    }

    @GetMapping("/approvals")
    public JsonNode approvals() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/approvals.json"));
        return jsonNode;
    }

    @GetMapping("/ssoAccount")
    public JsonNode ssoAccount() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/ssoAccount.json"));
        return jsonNode;
    }

    @GetMapping("/subComplex")
    public JsonNode subComplex() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(new File("src/main/java/com/example/SpringBootDP/response/subComplex.json"));
        return jsonNode;
    }
}
