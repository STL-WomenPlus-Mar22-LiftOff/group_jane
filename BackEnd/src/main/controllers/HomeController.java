package main.java.org.launchcode.TimeLeaf.controllers;

//sample copied from tech-jobs studio #19.6 --> needs to be updated for our own home page

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
    public class HomeController {


        @Autowired
        private JobRepository jobRepository;

        @RequestMapping("")
        public String index(Model model) {
            model.addAttribute("jobs", jobRepository.findAll());
            return "index";
        }

        @GetMapping("add")
        public String displayAddJobForm(Model model) {
            model.addAttribute(new BatchProperties.Job());
            return "add";
        }

        @PostMapping("add")
        public String processAddJobForm(@ModelAttribute @Valid Job newJob,
                                        Errors errors) {

            if (errors.hasErrors()) {
                return "add";
            }

            jobRepository.save(newJob);
            return "redirect:";
        }

        @GetMapping("view/{jobId}")
        public String displayViewJob(Model model, @PathVariable int jobId) {

            Optional optJob = jobRepository.findById(jobId);
            if (!optJob.isEmpty()) {
                Job job = (Job) optJob.get();
                model.addAttribute("job", job);
                return "view";
            } else {
                return "redirect:/";
            }
        }
    }
