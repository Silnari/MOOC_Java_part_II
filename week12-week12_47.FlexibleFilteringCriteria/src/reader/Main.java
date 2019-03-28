package reader;

import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;

public class Main {

    public static void main(String[] args) {
        Criterion criterion = new EndsWithQuestionOrExclamationMark();

        System.out.println(criterion.complies("test?"));
    }
}
