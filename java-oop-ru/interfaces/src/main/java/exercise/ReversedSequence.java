package exercise;

import java.util.stream.IntStream;

// BEGIN
public class ReversedSequence implements CharSequence {
    public ReversedSequence(String sequence) {
        this.sequence = new StringBuilder(sequence).reverse().toString();
    }

    private final String sequence;

    @Override
    public int length() {
        return sequence.length();
    }

    @Override
    public char charAt(int index) {
        return sequence.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return sequence.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return sequence.subSequence(start, end);
    }

    @Override
    public IntStream chars() {
        return sequence.chars();
    }

    @Override
    public IntStream codePoints() {
        return sequence.codePoints();
    }

    @Override
    public String toString() {
        return sequence;
    }
}
// END
