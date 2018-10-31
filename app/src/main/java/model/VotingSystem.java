package model;

public abstract class VotingSystem {

    protected String name;
    protected String text;

    public VotingSystem() {
    }

    public void setName(String name){
        this.name = name;
    }
    public void setText(String text) {this.text = text;}

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VotingSystem)) return false;

        VotingSystem that = (VotingSystem) o;

        if (!name.equals(that.name)) return false;
        return text.equals(that.text);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + text.hashCode();
        return result;
    }

    public String getText() {
        return text;
    }
}
