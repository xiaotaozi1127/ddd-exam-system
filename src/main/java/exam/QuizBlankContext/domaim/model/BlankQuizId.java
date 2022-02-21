package exam.QuizBlankContext.domaim.model;

import exam.shared.ValueObject;
import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

@Getter
public class BlankQuizId implements ValueObject<BlankQuizId> {

    private final String id;

    private BlankQuizId(String blankQuizId) {
        this.id = blankQuizId;
    }

    public static BlankQuizId nextId() {
        return new BlankQuizId("BlankQuiz_" + UUID.randomUUID());
    }

    @Override
    public boolean sameValueAs(BlankQuizId other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlankQuizId blankQuizId = (BlankQuizId) o;
        return Objects.equals(id, blankQuizId.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id;
    }
}
