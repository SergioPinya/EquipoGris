package mainAplicacio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {
//localhost:8080
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
/*<parent>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-parent</artifactId>
<version>3.1.1</version>
</parent>
<build>
<sourceDirectory>src</sourceDirectory>
<plugins>
	<plugin>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-maven-plugin</artifactId>
	</plugin>
</plugins>
</build>
<dependencies>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
	<version>3.1.1</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.mongodb/mongo-java-driver -->
<dependency>
	<groupId>org.mongodb</groupId>
	<artifactId>mongo-java-driver</artifactId>
	<version>3.12.14</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.json/json -->
<dependency>
	<groupId>org.json</groupId>
	<artifactId>json</artifactId>
	<version>20231013</version>
</dependency>
<!-- https://mvnrepository.com/artifact/commons-codec/commons-codec -->
<dependency>
	<groupId>commons-codec</groupId>
	<artifactId>commons-codec</artifactId>
	<version>1.15</version>
</dependency>
</dependencies>
</project>*/