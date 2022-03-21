public class mean {
    private static float mean(float[] number){
    float tengah= 0;
    for (float dataNumber : number) {
        tengah += dataNumber;
    }
    return tengah/number.length;
    }

    public static void main(String[] args) {
        float[] value={1,2,3,4};
        System.out.println(mean(value));
        float[] value1={1,2,3,4,5,6,7,8,9,10};
        System.out.println(mean(value1));
    }
}
