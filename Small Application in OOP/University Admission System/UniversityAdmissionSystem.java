/* Q3. University Admission System – Priority Ranking
Base class: Applicant
Fields: name, score
 Method: getRankScore() → returns score directly
Child classes:
SportsQuota: adds +15 to score
DefenseQuota: adds +10 to score
General: no extra
NRIQuota: +20 but fee is 3× normal

Task:
Take 12 applicants (mix of all categories).
Override getRankScore() in each child.
Sort applicants by rank score (high to low).
Print top 3 shortlisted candidates.
Concepts
Overriding
Sorting array of objects
Multiple child classes
Priority logic
*/
class Applicant
{
	String name;
	int score;
	Applicant(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	int getRankScore()
	{
		return score;
	}
}
class SportsQuota extends Applicant
{
	SportsQuota(String name, int score)
	{
		super(name,score);
	}
	int getRankScore()
	{
		return score+15;
	}
}
class DefenseQuota extends Applicant
{
	DefenseQuota(String name, int score)
	{
		super(name,score);
	}
	int getRankScore()
	{
		return score + 10; 
	}
}
class General extends Applicant
{
	General(String name, int score)
	{
		super(name, score);
	}
	int getRankScore()
	{
		return score;
	}
}
class NRIQuota extends Applicant
{
	NRIQuota(String name, int score)
	{
		super(name, score);
	}
	int getRankScore()
	{
		return score + 20;
	}
}

public class UniversityAdmissionSystem
{
	public static voud main(String x[])
	{
		
	}
}