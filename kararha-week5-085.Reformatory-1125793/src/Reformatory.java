public class Reformatory {
    //variable to measure how many times the weight has been measured
    private int timesWeightMeasured;
    public int weight(Person person) {
        // return the weight of the person
        this.timesWeightMeasured++;
        return person.getWeight();
    }
    
    //increases weight by 1
    public void feed(Person person){
       person.setWeight(person.getWeight()+1);
    }
    //method to return the number how many times the weight has been measured
    public int totalWeightsMeasured(){
        return this.timesWeightMeasured;
    }
}
