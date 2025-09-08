@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }
}





// Add Dockerfile to GitHud
//  git init
//  git add nginx
//  git commit -m "Add nginx folder with Dockerfile"
//  git remote add origin https://github.com/shreyash-26/Dockerfile.git
//  git branch -M main
//  git push -u origin main