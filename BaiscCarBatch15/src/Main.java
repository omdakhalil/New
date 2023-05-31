public class Main {
    public static void main(String[] args) {
        BasicStructure audi =new BasicStructure();
        audi.color="balck";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinder="6";
        x.size="1234";
        x.weight="4532k";

        lights neon = new lights();

        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumin";

        Color col=new Color();

        col.colorLights="True";
        col.colorTyre="false";
        col.colorWindows="True";



    }
}