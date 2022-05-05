package lesson8.HomeWork8;

public class AnimalVoice {

    private String voice;

    public AnimalVoice(String voice) {
        this.voice = voice;
    }

    public void setVoice(String newVoice){
        this.voice = newVoice;
    }

    public void voice() {
        System.out.println("Animal's voices");
    }


    @Override
    public String toString() {
        return "AnimalVoice{" +
                "voice='" + voice + '\'' +
                '}';
    }
}