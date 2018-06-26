package com.greenfoxacademy.springstart.controllers;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  Translation translation = new Translation();

  @RequestMapping("/web/helloworld")
  public String helloworld(Model model) {
    model.addAttribute("translation", translation.translation());
    model.addAttribute("size", translation.fontSize());
    model.addAttribute("rgbR", translation.rgbR());
    model.addAttribute("rgbG", translation.rgbG());
    model.addAttribute("rgbB", translation.rgbB());
    return "helloworld";
  }

}