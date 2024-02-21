package epicode.exercise.exOne.classes;
import epicode.exercise.exOne.interfaces.DataSource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserData {
    private String fullName;
    private int age;
    public void getData(DataSource ds){
        fullName = ds.getFullName();
        age = ds.getAge();
    }
}
