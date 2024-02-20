package ma.mbricolage.mbcav2.web;



import lombok.AllArgsConstructor;
import ma.mbricolage.mbcav2.dao.CashtickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
public class TicketController {


    @Autowired
    private CashtickRepository cashtickRepository;


   /* @GetMapping("/cashtick")
    public List<Object[]> getAllcashticket(){

      return   cashtickRepository.yourCustomQuery();

    }*/


 /*@GetMapping("/barChart")
    public String getAllTickets(Model model) {

        // Fetch the result of the native query
        List<Object[]> result = cashtickRepository.yourCustomQuery();

        // Extract site and ca values from the result
        List<Long> siteList = result.stream().map(row -> ((Number) row[0]).longValue()).collect(Collectors.toList());
        List<Double> caList = result.stream().map(row -> ((Number) row[1]).doubleValue()).collect(Collectors.toList());

        // Add the lists to the model
        model.addAttribute("site", siteList);
        model.addAttribute("ca", caList);

        return "barChart";
    }*/


    @GetMapping(path = "/user/index")
    @PreAuthorize("hasRole('USER')")
    public  String Ticket(Model model){

        List<Object[]> tickets =cashtickRepository.yourCustomQuery();

        List<Long> siteList = tickets.stream().map(row -> ((Number) row[0]).longValue()).collect(Collectors.toList());
       List<String> NomList = tickets.stream().map(row -> ((String) row[2])).toList();
        List<Double> caList = tickets.stream().map(row -> ((Number) row[1]).doubleValue()).collect(Collectors.toList());
       // List<Double> caapList = tickets.stream().map(row -> ((Number) row[3]).doubleValue()).collect(Collectors.toList());

        // Add the lists to the model
        model.addAttribute("site", siteList);
        model.addAttribute("ca", caList);
    // model.addAttribute("caap", caapList);
        model.addAttribute("Nom",NomList);
        model.addAttribute("ListTicket", tickets);
        return "index";
    }

    @GetMapping("/")
    @PreAuthorize("hasRole('USER')")
    public  String home(){
        return  "redirect:/user/index";
    }




}
