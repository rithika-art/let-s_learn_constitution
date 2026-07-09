package com.constitution.backend.service;

import com.constitution.backend.entity.Article;
import com.constitution.backend.entity.Question;
import com.constitution.backend.entity.Leaderboard;
import com.constitution.backend.repository.ArticleRepository;
import com.constitution.backend.repository.QuestionRepository;
import com.constitution.backend.repository.LeaderboardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ArticleRepository articleRepository;
    private final QuestionRepository questionRepository;
    private final LeaderboardRepository leaderboardRepository;

    public DataSeeder(ArticleRepository articleRepository,
                      QuestionRepository questionRepository,
                      LeaderboardRepository leaderboardRepository) {
        this.articleRepository = articleRepository;
        this.questionRepository = questionRepository;
        this.leaderboardRepository = leaderboardRepository;
    }

    @Override
    public void run(String... args) {

        if (articleRepository.count() > 0) return;

        seedArticles();
        seedQuestions();
        seedLeaderboard();
    }

    private void seedArticles() {

        Article a1 = new Article();
        a1.setArticleNumber("Article 1"); a1.setTitle("Name and Territory of the Union");
        a1.setPart("Part I"); a1.setChapter("Chapter I");
        a1.setContent("India, that is Bharat, shall be a Union of States. The territory of India shall consist of: (a) the territories of the States; (b) the Union territories specified in the First Schedule; and (c) such other territories as may be acquired.");
        a1.setKeywords("Union, Territory, States, India");
        articleRepository.save(a1);

        Article a2 = new Article();
        a2.setArticleNumber("Article 12"); a2.setTitle("Definition of State");
        a2.setPart("Part III"); a2.setChapter("Chapter I");
        a2.setContent("In this Part, unless the context otherwise requires, the State includes the Government and Parliament of India and the Government and the Legislature of each of the States and all local or other authorities within the territory of India or under the control of the Government of India.");
        a2.setKeywords("State, Definition, Government, Authorities");
        articleRepository.save(a2);

        Article a3 = new Article();
        a3.setArticleNumber("Article 14"); a3.setTitle("Right to Equality");
        a3.setPart("Part III"); a3.setChapter("Chapter I");
        a3.setContent("The State shall not deny to any person equality before the law or the equal protection of the laws within the territory of India.");
        a3.setKeywords("Equality, Law, Right, Equal Protection");
        articleRepository.save(a3);

        Article a4 = new Article();
        a4.setArticleNumber("Article 19"); a4.setTitle("Protection of certain rights regarding freedom of speech etc.");
        a4.setPart("Part III"); a4.setChapter("Chapter II");
        a4.setContent("All citizens shall have the right: (a) to freedom of speech and expression; (b) to assemble peaceably and without arms; (c) to form associations or unions; (d) to move freely throughout the territory of India; (e) to reside and settle in any part of the territory of India; (f) to practice any profession, or to carry on any occupation, trade or business.");
        a4.setKeywords("Freedom, Speech, Expression, Assembly, Movement, Profession");
        articleRepository.save(a4);

        Article a5 = new Article();
        a5.setArticleNumber("Article 21"); a5.setTitle("Protection of life and personal liberty");
        a5.setPart("Part III"); a5.setChapter("Chapter II");
        a5.setContent("No person shall be deprived of his life or personal liberty except according to procedure established by law.");
        a5.setKeywords("Life, Liberty, Personal, Protection");
        articleRepository.save(a5);

        Article a6 = new Article();
        a6.setArticleNumber("Article 32"); a6.setTitle("Remedies for enforcement of rights conferred by this Part");
        a6.setPart("Part III"); a6.setChapter("Chapter IV");
        a6.setContent("The right to move the Supreme Court by appropriate proceedings for the enforcement of the rights conferred by this Part is guaranteed.");
        a6.setKeywords("Remedies, Supreme Court, Enforcement, Rights");
        articleRepository.save(a6);

        Article a7 = new Article();
        a7.setArticleNumber("Article 44"); a7.setTitle("Uniform civil code for the citizens");
        a7.setPart("Part IV"); a7.setChapter("Chapter I");
        a7.setContent("The State shall endeavour to secure for the citizens a uniform civil code throughout the territory of India.");
        a7.setKeywords("Uniform Civil Code, Citizens, Directive Principle");
        articleRepository.save(a7);

        Article a8 = new Article();
        a8.setArticleNumber("Article 51A"); a8.setTitle("Fundamental Duties");
        a8.setPart("Part IVA"); a8.setChapter("Chapter I");
        a8.setContent("It shall be the duty of every citizen of India to abide by the Constitution and respect its ideals and institutions, the National Flag and the National Anthem.");
        a8.setKeywords("Fundamental Duties, Citizens, Constitution, National Flag");
        articleRepository.save(a8);

        Article a9 = new Article();
        a9.setArticleNumber("Article 368"); a9.setTitle("Power of Parliament to amend the Constitution");
        a9.setPart("Part XX"); a9.setChapter("Chapter I");
        a9.setContent("Notwithstanding anything in this Constitution, Parliament may in exercise of its constituent power amend by way of addition, variation or repeal any provision of this Constitution in accordance with the procedure laid down in this article.");
        a9.setKeywords("Amendment, Parliament, Constitution, Power");
        articleRepository.save(a9);
    }

    private void seedQuestions() {

        Question q1 = new Question();
        q1.setQuestion("When was the Indian Constitution adopted?");
        q1.setOptionA("1947"); q1.setOptionB("1948"); q1.setOptionC("1949"); q1.setOptionD("1950");
        q1.setCorrectAnswer("C"); q1.setExplanation("The Constitution was adopted on 26 November 1949.");
        q1.setDifficulty("Easy"); q1.setCategory("History");
        questionRepository.save(q1);

        Question q2 = new Question();
        q2.setQuestion("Who is known as the Father of the Indian Constitution?");
        q2.setOptionA("Mahatma Gandhi"); q2.setOptionB("Jawaharlal Nehru");
        q2.setOptionC("B.R. Ambedkar"); q2.setOptionD("Sardar Patel");
        q2.setCorrectAnswer("C"); q2.setExplanation("Dr. B.R. Ambedkar was the Chairman of the Drafting Committee.");
        q2.setDifficulty("Easy"); q2.setCategory("History");
        questionRepository.save(q2);

        Question q3 = new Question();
        q3.setQuestion("How many articles were there in the original Constitution?");
        q3.setOptionA("365"); q3.setOptionB("395"); q3.setOptionC("448"); q3.setOptionD("470");
        q3.setCorrectAnswer("B"); q3.setExplanation("The original Constitution had 395 articles.");
        q3.setDifficulty("Medium"); q3.setCategory("Structure");
        questionRepository.save(q3);

        Question q4 = new Question();
        q4.setQuestion("What does Article 21 guarantee?");
        q4.setOptionA("Right to Equality"); q4.setOptionB("Right to Freedom");
        q4.setOptionC("Right to Life"); q4.setOptionD("Right to Education");
        q4.setCorrectAnswer("C"); q4.setExplanation("Article 21 guarantees protection of life and personal liberty.");
        q4.setDifficulty("Easy"); q4.setCategory("Fundamental Rights");
        questionRepository.save(q4);

        Question q5 = new Question();
        q5.setQuestion("Which part of the Constitution deals with Fundamental Rights?");
        q5.setOptionA("Part I"); q5.setOptionB("Part II"); q5.setOptionC("Part III"); q5.setOptionD("Part IV");
        q5.setCorrectAnswer("C"); q5.setExplanation("Fundamental Rights are covered in Part III of the Constitution.");
        q5.setDifficulty("Easy"); q5.setCategory("Fundamental Rights");
        questionRepository.save(q5);

        Question q6 = new Question();
        q6.setQuestion("What is the supreme law of India?");
        q6.setOptionA("The Parliament"); q6.setOptionB("The Constitution");
        q6.setOptionC("The Supreme Court"); q6.setOptionD("The President");
        q6.setCorrectAnswer("B"); q6.setExplanation("The Constitution of India is the supreme law of the land.");
        q6.setDifficulty("Easy"); q6.setCategory("Basics");
        questionRepository.save(q6);

        Question q7 = new Question();
        q7.setQuestion("Which article abolishes untouchability?");
        q7.setOptionA("Article 14"); q7.setOptionB("Article 15");
        q7.setOptionC("Article 16"); q7.setOptionD("Article 17");
        q7.setCorrectAnswer("D"); q7.setExplanation("Article 17 abolishes untouchability and its practice in any form.");
        q7.setDifficulty("Medium"); q7.setCategory("Fundamental Rights");
        questionRepository.save(q7);

        Question q8 = new Question();
        q8.setQuestion("What is the procedure to amend the Constitution?");
        q8.setOptionA("Simple Majority"); q8.setOptionB("Special Majority");
        q8.setOptionC("Both A and B"); q8.setOptionD("None");
        q8.setCorrectAnswer("C"); q8.setExplanation("Different amendments require different types of majorities as specified in Article 368.");
        q8.setDifficulty("Hard"); q8.setCategory("Amendment");
        questionRepository.save(q8);
    }

    private void seedLeaderboard() {

        Leaderboard l1 = new Leaderboard(); l1.setUserName("Rahul"); l1.setScore(85); l1.setQuizzesCompleted(3);
        leaderboardRepository.save(l1);

        Leaderboard l2 = new Leaderboard(); l2.setUserName("Priya"); l2.setScore(92); l2.setQuizzesCompleted(4);
        leaderboardRepository.save(l2);

        Leaderboard l3 = new Leaderboard(); l3.setUserName("Amit"); l3.setScore(78); l3.setQuizzesCompleted(2);
        leaderboardRepository.save(l3);

        Leaderboard l4 = new Leaderboard(); l4.setUserName("Sneha"); l4.setScore(95); l4.setQuizzesCompleted(5);
        leaderboardRepository.save(l4);
    }
}
