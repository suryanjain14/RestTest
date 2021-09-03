package com.example.second
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path="/demo")
class DbController {
    @Autowired
    private TestRepo testRepo

    @PostMapping(path="/add")
    @ResponseBody
    String addData (@RequestBody Test test ) {
        testRepo.save(test)
        return "Saved"
    }

    @GetMapping(path="/all")
    @ResponseBody getAllGrades() {
        testRepo.findAll()
    }
}
