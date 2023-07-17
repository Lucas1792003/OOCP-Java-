public class AnInt {
    private int number;

    public AnInt(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void swap() {
        if (number >= -100 && number < 100) {
            // no swapping required for 2-digit numbers
            return;
        }
        int sign = Integer.signum(number);
        int absNumber = Math.abs(number);
        int firstDigit = absNumber / (int) Math.pow(10, (int) Math.log10(absNumber));
        int lastDigit = absNumber % 10;
        int middleDigits = absNumber % (int) Math.pow(10, (int) Math.log10(absNumber)) / 10;
        int swappedNumber = sign * (lastDigit * (int) Math.pow(10, (int) Math.log10(absNumber)) + middleDigits * 10 + firstDigit);
        number = swappedNumber;

    }


}
//swap the first and last character method
