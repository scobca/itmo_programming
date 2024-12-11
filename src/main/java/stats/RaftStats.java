package stats;

public enum RaftStats {
    POWERFUL("мощный "), AGILE("поворотливый ");

    private final String raftStat;

    RaftStats(String raftStat) {
        this.raftStat = raftStat;
    }

    @Override
    public String toString() {
        return raftStat;
    }
}
