public class RGB{
    Integer red;
    Integer green;
    Integer blue;
    RGB(){
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }
    RGB(Integer red, Integer green, Integer blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Integer.toString(this.red+this.green+this.blue);
    }
}