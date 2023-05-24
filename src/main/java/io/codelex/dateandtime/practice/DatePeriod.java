package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private final LocalDate start;
    private final LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public DatePeriod intersection(DatePeriod otherPeriod) {
        String overlapMessage = doesPeriodCompletelyInclude(otherPeriod);

        if (overlapMessage != null) {
            System.out.println(overlapMessage);
            return null;
        } else if (!doPeriodsOverlap(otherPeriod)) {
            return null;
        } else {
            LocalDate intersectionStart = getMaxStartDate(otherPeriod);
            LocalDate intersectionEnd = getMinEndDate(otherPeriod);
            return new DatePeriod(intersectionStart, intersectionEnd);
        }
    }

    private boolean doPeriodsOverlap(DatePeriod otherPeriod) {
        return !(end.isBefore(otherPeriod.getStart()) || start.isAfter(otherPeriod.getEnd()));
    }

    private LocalDate getMaxStartDate(DatePeriod otherPeriod) {
        return start.isBefore(otherPeriod.getStart()) ? otherPeriod.getStart() : start;
    }

    private LocalDate getMinEndDate(DatePeriod otherPeriod) {
        return end.isAfter(otherPeriod.getEnd()) ? otherPeriod.getEnd() : end;
    }

    private String doesPeriodCompletelyInclude(DatePeriod otherPeriod) {
        if (start.isBefore(otherPeriod.getStart()) && end.isAfter(otherPeriod.getEnd())) {
            return "Overlap: first period completely includes the second";
        } else if (otherPeriod.getStart().isBefore(start) && otherPeriod.getEnd().isAfter(end)) {
            return "Overlap: second period completely includes the first";
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        if (overlap != null) {
            System.out.println("Overlap: " + overlap.getStart() + " - " + overlap.getEnd());
        }
    }
}