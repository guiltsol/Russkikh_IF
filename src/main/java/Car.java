import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Car {

    private int yearOfRelease;
    private String transmissionType;
    private String model;
    private int energyCapacity;
    private int maxSpeed;
    private String color;
}
