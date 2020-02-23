package ejercicio4;

public class Patient {
    private Integer id;
    private Integer age;
    private BloodData bloodData;
    
    public Patient(){
    id=0;
    age=0;
    this.bloodData=new BloodData();
    }
    public Patient(Integer id, Integer age, BloodData a){
    this.id=id;
    this.age=age;
    this.bloodData=a;
    }
    public String toString(){
        String a="ID:" + id +"\n"+"Age:"+age+"\n"+bloodData.toString();
        return a;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }
    
    
}
