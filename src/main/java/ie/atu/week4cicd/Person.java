package ie.atu.week4cicd;


import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    private     String name;

    @NotBlank(message = "Name cannot be blank")
    private String title;

    @NotNull(message = "Name cannot be blank")
    private int employeeId;

    @Min(value = 0, message = "must be greater than or equal to 0")
    private int age;

    @Email(message = "needs to be a valid email")
    private String email;

    @NotBlank(message = " Position cannot be blank")
    private String position;

    @NotBlank(message = " Department cannot be blank")
    private String department;
}
