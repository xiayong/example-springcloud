package me.xiayong.example.springcloud.consumer.controller;

import me.xiayong.example.springcloud.api.ExampleFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

/**
 * @author YongXia.
 * @since 1.0
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private ExampleFacade exampleFacade;

    @GetMapping("")
    public String test() {
        return exampleFacade.now();
    }

    @PostMapping(value = "upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) throws IOException {
        String targetFileName = System.getProperty("java.io.tmpdir") + UUID.randomUUID().toString().replaceAll("-", "") + "-" + file.getOriginalFilename();
        Files.copy(file.getInputStream(), Paths.get(targetFileName));
        return targetFileName;
    }

}
