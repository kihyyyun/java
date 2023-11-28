package d5;


    //사람을 나타내는 클래스 이다.
    // 사람은 (이름 "name" 나이("age") 정보를 가질 수 있따.
    //age() 라는 메서드를 가지고 있으며 호출되면 age += 1및 새로운 나이 반환
    //name과 age에 대한 Getter 메서드
    //name을 인자로 전달하는 생성자

public class Person {
    public String name;

    public int age;



    public Person(String name){
        this.name =name;
        this.age =0;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int age (){
        age+=1;
        return age;
    }
    public  String gender;

    // 인사하는 기능 => "Hello, my name is<이름>!'
    public void hello(){
        System.out.println(String.format("Hellow, my name is %s",name));


    }
}
