-- Seed Articles
INSERT INTO articles (article_number, title, part, chapter, content, keywords) VALUES
('Article 1', 'Name and Territory of the Union', 'Part I', 'Chapter I', 'India, that is Bharat, shall be a Union of States. The territory of India shall consist of: (a) the territories of the States; (b) the Union territories specified in the First Schedule; and (c) such other territories as may be acquired.', 'Union, Territory, States, India'),
('Article 12', 'Definition of State', 'Part III', 'Chapter I', 'In this Part, unless the context otherwise requires, the State includes the Government and Parliament of India and the Government and the Legislature of each of the States and all local or other authorities within the territory of India or under the control of the Government of India.', 'State, Definition, Government, Authorities'),
('Article 14', 'Right to Equality', 'Part III', 'Chapter I', 'The State shall not deny to any person equality before the law or the equal protection of the laws within the territory of India.', 'Equality, Law, Right, Equal Protection'),
('Article 19', 'Protection of certain rights regarding freedom of speech etc.', 'Part III', 'Chapter II', 'All citizens shall have the right: (a) to freedom of speech and expression; (b) to assemble peaceably and without arms; (c) to form associations or unions; (d) to move freely throughout the territory of India; (e) to reside and settle in any part of the territory of India; (f) to practice any profession, or to carry on any occupation, trade or business.', 'Freedom, Speech, Expression, Assembly, Movement, Profession'),
('Article 21', 'Protection of life and personal liberty', 'Part III', 'Chapter II', 'No person shall be deprived of his life or personal liberty except according to procedure established by law.', 'Life, Liberty, Personal, Protection'),
('Article 32', 'Remedies for enforcement of rights conferred by this Part', 'Part III', 'Chapter IV', 'The right to move the Supreme Court by appropriate proceedings for the enforcement of the rights conferred by this Part is guaranteed.', 'Remedies, Supreme Court, Enforcement, Rights'),
('Article 44', 'Uniform civil code for the citizens', 'Part IV', 'Chapter I', 'The State shall endeavour to secure for the citizens a uniform civil code throughout the territory of India.', 'Uniform Civil Code, Citizens, Directive Principle'),
('Article 51A', 'Fundamental Duties', 'Part IVA', 'Chapter I', 'It shall be the duty of every citizen of India to abide by the Constitution and respect its ideals and institutions, the National Flag and the National Anthem.', 'Fundamental Duties, Citizens, Constitution, National Flag'),
('Article 368', 'Power of Parliament to amend the Constitution', 'Part XX', 'Chapter I', 'Notwithstanding anything in this Constitution, Parliament may in exercise of its constituent power amend by way of addition, variation or repeal any provision of this Constitution in accordance with the procedure laid down in this article.', 'Amendment, Parliament, Constitution, Power');

-- Seed Questions
INSERT INTO questions (question, option_a, option_b, option_c, option_d, correct_answer, explanation, difficulty, category) VALUES
('When was the Indian Constitution adopted?', '1947', '1948', '1949', '1950', '1949', 'The Constitution was adopted on 26 November 1949.', 'Easy', 'History'),
('Who is known as the Father of the Indian Constitution?', 'Mahatma Gandhi', 'Jawaharlal Nehru', 'B.R. Ambedkar', 'Sardar Patel', 'B.R. Ambedkar', 'Dr. B.R. Ambedkar was the Chairman of the Drafting Committee.', 'Easy', 'History'),
('How many articles were there in the original Constitution?', '365', '395', '448', '470', '395', 'The original Constitution had 395 articles.', 'Medium', 'Structure'),
('What does Article 21 guarantee?', 'Right to Equality', 'Right to Freedom', 'Right to Life', 'Right to Education', 'Right to Life', 'Article 21 guarantees protection of life and personal liberty.', 'Easy', 'Fundamental Rights'),
('Which part of the Constitution deals with Fundamental Rights?', 'Part I', 'Part II', 'Part III', 'Part IV', 'Part III', 'Fundamental Rights are covered in Part III of the Constitution.', 'Easy', 'Fundamental Rights'),
('What is the supreme law of India?', 'The Parliament', 'The Constitution', 'The Supreme Court', 'The President', 'The Constitution', 'The Constitution of India is the supreme law of the land.', 'Easy', 'Basics'),
('Which article abolishes untouchability?', 'Article 14', 'Article 15', 'Article 16', 'Article 17', 'Article 17', 'Article 17 abolishes untouchability and its practice in any form.', 'Medium', 'Fundamental Rights'),
('What is the procedure to amend the Constitution?', 'Simple Majority', 'Special Majority', 'Both A and B', 'None', 'Both A and B', 'Different amendments require different types of majorities as specified in Article 368.', 'Hard', 'Amendment');

-- Seed Leaderboard
INSERT INTO leaderboard (user_name, score, quizzes_completed) VALUES
('Rahul', 85, 3),
('Priya', 92, 4),
('Amit', 78, 2),
('Sneha', 95, 5);
