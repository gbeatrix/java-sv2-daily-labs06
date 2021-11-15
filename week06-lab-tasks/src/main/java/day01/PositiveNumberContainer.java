package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Double> nums = new ArrayList<>();

    public boolean add(double num){
        if(num>0d){
            nums.add(num);
            return true;
        }
        return false;
    }

    public List<Double> getNums() {
        return nums;
    }
}
