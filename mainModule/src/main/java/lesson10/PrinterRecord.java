package lesson10;

public record PrinterRecord(String text, String source) {
    // в скобках указываются все параметры, которые необходимы для обозначения полей

    public void print() {
        System.out.println(text());
    }
}
