package classWork2;

public class Referee extends Employee {

    private int judgmentErrors;
    private int totalGamesRefereed;
    private int maximumJudgmentErrors;

    public Referee(String firstName, String lastName, int seniority, int judgmentErrors, int totalGamesRefereed, int maximumJudgmentErrors) {
        super(firstName, lastName, seniority);
        this.judgmentErrors = judgmentErrors;
        this.totalGamesRefereed = totalGamesRefereed;
        this.maximumJudgmentErrors = maximumJudgmentErrors;
        if (judgmentErrors > maximumJudgmentErrors) {
            maximumJudgmentErrors = judgmentErrors;
        }
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public void setIdNumber(String idNumber) {
        super.setIdNumber(idNumber);
    }

    @Override
    public void setSeniority(int seniority) {
        super.setSeniority(seniority);
    }

    public void setJudgmentErrors(int judgmentErrors) {
        this.judgmentErrors = judgmentErrors;
    }

    public void setTotalGamesRefereed(int totalGamesRefereed) {
        this.totalGamesRefereed = totalGamesRefereed;
    }

    public void setMaximumJudgmentErrors(int maximumJudgmentErrors) {
        this.maximumJudgmentErrors = maximumJudgmentErrors;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getIdNumber() {
        return super.getIdNumber();
    }

    @Override
    public int getSeniority() {
        return super.getSeniority();
    }

    public int getJudgmentErrors() {
        return judgmentErrors;
    }

    public int getTotalGamesRefereed() {
        return totalGamesRefereed;
    }

    public int getMaximumJudgmentErrors() {
        return maximumJudgmentErrors;
    }

    @Override
    public double salaryOfEmployee() {
        double updatedSalary = getBaseSalary() + (30 * getTotalGamesRefereed());
        if (maximumJudgmentErrors == judgmentErrors) {
            updatedSalary -= 500;
        }
        return updatedSalary;
    }

    @Override
    public boolean outstanding() {
        if (getJudgmentErrors() < getMaximumJudgmentErrors() * 0.5) {
            return true;
        }
        return false;
    }

    public void addJudgmentErrors(int error) {
        this.judgmentErrors += error;
        if (judgmentErrors > maximumJudgmentErrors) {
            maximumJudgmentErrors = judgmentErrors;
        }
    }

    public void addGames(int numberOfGames) {
        this.totalGamesRefereed += numberOfGames;
    }

    public String toString() {
        return super.toString() + "\nJudgment errors: " + getJudgmentErrors() + "\nTotal games he refereed: " + getTotalGamesRefereed() + "\nUpdated salary: " + salaryOfEmployee() + "\nMaximum judgment errors: " + maximumJudgmentErrors;
    }
}
