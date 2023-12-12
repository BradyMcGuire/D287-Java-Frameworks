package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        OutsourcedPart part1= new OutsourcedPart();
        part1.setCompanyName("The Computer Shop");
        part1.setName("CPU");
        part1.setInv(5);
        part1.setPrice(200.0);
        part1.setId(100L);
        part1.setInvMin(0);
        part1.setInvMax(5);
        outsourcedPartRepository.save(part1);
        OutsourcedPart thePart=null;

        OutsourcedPart part2= new OutsourcedPart();
        part2.setCompanyName("The Computer Shop");
        part2.setName("MotherBoard");
        part2.setInv(5);
        part2.setPrice(150.0);
        part2.setId(200L);
        part2.setInvMin(0);
        part2.setInvMax(5);
        outsourcedPartRepository.save(part2);
        OutsourcedPart thePart2=null;

        OutsourcedPart part3= new OutsourcedPart();
        part3.setCompanyName("The Computer Shop");
        part3.setName("Memory");
        part3.setInv(5);
        part3.setPrice(80.0);
        part3.setId(300L);
        part3.setInvMin(0);
        part3.setInvMax(5);
        outsourcedPartRepository.save(part3);
        OutsourcedPart thePart3=null;

        OutsourcedPart part4= new OutsourcedPart();
        part4.setCompanyName("The Computer Shop");
        part4.setName("Storage");
        part4.setInv(5);
        part4.setPrice(50.0);
        part4.setId(400L);
        part4.setInvMin(0);
        part4.setInvMax(5);
        outsourcedPartRepository.save(part4);
        OutsourcedPart thePart4=null;

        OutsourcedPart part5= new OutsourcedPart();
        part5.setCompanyName("The Computer Shop");
        part5.setName("Graphics Card");
        part5.setInv(5);
        part5.setPrice(250.0);
        part5.setId(500L);
        part5.setInvMin(0);
        part5.setInvMax(5);
        outsourcedPartRepository.save(part5);
        OutsourcedPart thePart5=null;


        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();

        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }


        Product entry= new Product("Entry level computer",500.0,10);
        Product entry2= new Product("Entry plus level computer",750.0,10);
        Product midRange= new Product("Mid-Range level computer",1000.0,10);
        Product highEnd= new Product("High-end level computer",1250.0,10);
        Product ultra= new Product("Ultra level computer",1500.0,10);
        productRepository.save(entry);
        productRepository.save(entry2);
        productRepository.save(midRange);
        productRepository.save(highEnd);
        productRepository.save(ultra);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
