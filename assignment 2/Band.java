import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Band extends Artist {
    private int membersCount;

    public Band(String name, String musicType, int membersCount) {
        super(name, musicType);
        this.membersCount = membersCount;
    }

    public int getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(int membersCount) {
        this.membersCount = membersCount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Members: " + membersCount;
    }
}
