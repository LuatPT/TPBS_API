package mainapp;


@SpringBootApplication(scanBasePackages={"mainapp"})
public class MainApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
