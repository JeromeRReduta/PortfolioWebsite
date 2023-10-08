INSERT INTO PROJECT (NAME, GITHUB, SKILLS_USED, SUMMARY) VALUES (
    'Top v2',
    'https://github.com/JeromeRReduta/P1-JeromeRReduta',
    'C, Memory Management, UML, Test-Driven Development, Documentation',
    '	In college, I made a simple implementation of the “top” Linux command. While this is alright, I decided I could do better, and refactored everything over a week-long vacation. The architecture was rebuilt from the ground up, I made full use of header files, and I documented every single file with UML. I even made unit tests! It’s not the most impressive, but it’s something I accomplished in school that I’m proud of.'
);

INSERT INTO PROJECT (NAME, GITHUB, SKILLS_USED, SUMMARY) VALUES (
    'Search Engine',
    'https://github.com/JeromeRReduta/SummerSoftwareSearchEngine',
    'Java, Search Engines, Multithreading and Concurrency, Lambda Functions, Design Patterns, HTML Parsing, Regex, Data Structures, JSON, Web Crawling, Work Queues, HTML, CSS',
    '	This is another college project I’m keeping for historical purposes. Throughout an intensive summer software development course, we had to create a search engine, refactoring constantly based on code review feedback. I added to and refactored starter files to make them process text, store them in an inverted index, crawl the web, output search results in JSON format, and then do all that using multiple threads in a work queue. This was one of the most educational projects I’ve done, and I’m proud to have it here.'
);
INSERT INTO PROJECT (NAME, GITHUB, SKILLS_USED, SUMMARY) VALUES (
    'Portfolio',
    'https://github.com/JeromeRReduta/PortfolioWebsite',
    'Spring MVC, Spring Boot, HTML, CSS, Bootstrap, Thymeleaf, Model-View-Controller, Java, SQL, Embedded Databases, AWS Elastic Beanstalk',
    '	I’ve heard it’s important to create a portfolio site, so my first recent project *is this site*. It’s in Spring Boot, using a Model-View-Controller pattern and an embedded database, hosted on AWS Elastic Beanstalk. My favorite part is that every page describing each project (e.g. this page) is all dynamically built from the same template. That means I can add another page with 5 lines of Java and 1 new SQL statement.'
);

INSERT INTO PROJECT (NAME, GITHUB, SKILLS_USED, SUMMARY) VALUES (
    'Search Engine MVC',
    'https://github.com/JeromeRReduta/project-JeromeRRedutaMVC/tree/Project_2_Partial_Search',
    'Java, Search Engines, Guava Data Structures, Lambda Functions, SOLID, Model View Controller, Regex, Data Structures, JSON',
    '	To prove to myself that I’ve improved (and to clean up my Search Engine codebase), I decided to recreate my Search Engine project from Software Development. For the sake of time, I only did up to Part 2 (a functioning, single-threaded, text-based search engine). Unlike in my college years, I used SOLID principles, and an MVC architecture for the inverted index, the stem counter, and the search result index. The result is a far cleaner, more maintainable, more digestible, and more extensible codebase.'
);

INSERT INTO PROJECT (NAME, GITHUB, SKILLS_USED, SUMMARY) VALUES (
    'React Tic-Tac-Toe',
    'https://github.com/JeromeRReduta/React-Tic-Tac-Toe',
    'JavaScript, React, HTML, Jest, Test-Driven Programming, CRC cards',
    '	Following the React Dev page’s tutorial, I implemented a fully functioning tic-tac-toe game for two people sharing a computer. It also has "time travel," where people can reset the board state to whatever it was during a previous move. I also created a few unit tests in Jest to ensure the data structures worked as intended. From this, I learned a lot about what makes React tick, as well as some JavaScript on the side.'
);

INSERT INTO PROJECT (NAME, GITHUB, SKILLS_USED, SUMMARY) VALUES (
    'Calculator With Logs',
    'https://github.com/JeromeRReduta/Calculator',
    'Java, Model View Controller, Monads, Functional Programming, JUnit, Test-Driven Programming',
    '	Calculators that take 2 numbers and an operation are a dime a dozen. I put two twists in my implementation: (1) users can input as many operations in a row as they want, and (2) before displaying the result, the calculator "shows its work" - it repeats all the steps it took to get to the result. To get the second criteria, I implemented a Writer monad called NumberWithLogs. This meant that operations could change the calculator’s result and record what operation was taken. From this, I learned about monads, the easiest/hardest/weirdest/monadest functional design pattern. I also learned JUnit, allowing me to ensure NumberWithLogs and OperationWithLogs worked correctly.'
);

INSERT INTO PROJECT (NAME, GITHUB, SKILLS_USED, SUMMARY) VALUES (
    'Bank App',
    'https://github.com/JeromeRReduta/BankApp/tree/master',
    'Java, Finite State Machine, Test-Driven Programming, JUnit, CRC Cards, Documentation',
    '	I created a bare-bones banking app using a finite state machine. Users can "login" to a pre-existing account, deposit and withdraw, view their account details, and "logout." Soon after starting, it became clear that an MVC wasn’t the best or simplest implementation of an app with a full menu system, which led me to the State pattern. From this project, I learned about how states and finite state machines work, which is crucial both in menu-based apps and in game development.'
);