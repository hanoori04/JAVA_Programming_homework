
abstract class Printer {
    // 멤버 변수
    protected String model;
    protected int printedCount = 0;
    protected int availableCount;

    // 생성자
    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    // 추상 메소드
    public abstract boolean print();
}

// 잉크젯 프린터 클래스
class InkjetPrinter extends Printer {

    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    // print() 메소드 오버라이딩
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.printf(
                "%s: %d매째 인쇄 실패 - 잉크 부족.%n",
                model, printedCount + 1
            );
            return false;
        }

        printedCount++;
        availableCount--;

        return true;
    }
}

// 레이저 프린터 클래스
class LaserPrinter extends Printer {

    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    // print() 메소드 오버라이딩
    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.printf(
                "%s: %d매째 인쇄 실패 - 토너 부족.%n",
                model, printedCount + 1
            );
            return false;
        }

        printedCount++;
        availableCount--;

        return true;
    }
}

// 메인 클래스
public class Homework7 {

    public static void main(String[] args) {

        InkjetPrinter inkjet =
            new InkjetPrinter("Brother DCP-T730DW", 7500);

        LaserPrinter laser =
            new LaserPrinter("Canon MFC643Cdw", 1500);

        while (inkjet.print()) {
        }

        while (laser.print()) {
        }
    }
}
