package lk.codelabs.rentcloud.rentprocesstask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class RentProcessTaskRunner implements CommandLineRunner {

    @Autowired
    RentProcessService rentProcessService;

    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0) {

            System.out.println("Task running with arguments");

            if (rentProcessService.validateDL(args[0])) {
                System.out.println("valid driving licence");
            } else {
                System.out.println("Invalid driving licence");
            }
        } else {
            System.out.println("Task running without arguments");
        }
    }
}
