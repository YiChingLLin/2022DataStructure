# Final Project - Let's Beat Google! #

## Term Project (30%) ##

> Including project proposal (20%), demo (40%) and implementation (40%).

> 3-5 students as a team.

- Goal: On the top of a giant’s shoulder, achieve advanced information searching with your expertise!

- Select a topic that you/your team members have interests.

- Make sure your search engine gets better results than a general search engine such as Google. 

## :pushpin: Stages ##
### Stage 0 (HW3) Keyword Counting [HW3](https://github.com/YiChingLLin/2022DataStructure/tree/master/lab3)
- Given an URL and a keyword

- Return how many times the keyword appears in the contents of the URL

### Stage 1 (30%+) Page Ranking [HW6](https://github.com/YiChingLLin/2022DataStructure/tree/master/lab6)
- Given a set of keywords and URLs

- Rank the URLs based on their score

- Define a score formula based on keyword appearances

- For each URL (a web page), return its rank, score, and the count on appearance of each keyword 

### Stage 2 (50%+) Site Ranking [HW6](https://github.com/YiChingLLin/2022DataStructure/tree/master/lab6)
- Multiple level keyword search

- Given a set of Web sites (URLs) and Keywords

- Rank the Web sites with their keyword appearances (including all its sub URLs)

- Define a score formula based on keyword appearances in the URL and all its sub URLs

- For each URL (a web site), return its rank, score, and a tree structure for its sub URLs along with the number of appearance of each keyword in each node

### Stage 3 (70%+) Refine the rank of Google [HW8](https://github.com/YiChingLLin/2022DataStructure/tree/master/lab8) [HW9](https://github.com/YiChingLLin/2022DataStructure/tree/master/lab9)
- Given a set of Keywords (No URLs)

- Use search engines to find potential URLs

- Apply the ranking on Stage 2 to these Web sites

### Stage 4 (80%+) Semantics Analysis [HW10](https://github.com/YiChingLLin/2022DataStructure/tree/master/lab10)
- Derive relative keywords from the discovered Web sites

- Iteratively do the same analysis on Stage 3

### Stage 5 (90%+) Publish Your Work Online [HW11](https://github.com/YiChingLLin/2022DataStructure/tree/master/lab11)
- Build a web site/service for your search engine

### Stage 6 (100%+) Export Your Work to App 
- Wrap your search engine as an iOS/android mobile application 

## :date: Important Date ##
### 11/17 Project proposal
Submit the project proposal (4-8 pages), which should include the following sections:

1. Introduction /Your topic and motivation

2. Search tricks /Your score formulation

3. System design /Class diagrams [proposal sample](http://www3.nccu.edu.tw/~yuf/DBProposalExample.pdf)

4. Schedule /How and when to accomplish stages

5. Challenges /Techniques that you need but may have a hard time to learn on your own

### 1/5 Project Demo 
- Location: 311 College of Commerce

- Each team gives **8 minutes PPT presentation** focusing on the project interests, key ideas, and achievements + **7 minutes system demo**

- In the demo, each team needs to **run your system** to show how it works and how it achieves the requirement for each stage. Will also check your source code.

- BONUS: Students who successfully challenge other team’s system may get extra points. 

### 1/12 Project Code and Final Report Upload

## :link: Install Instruction ##
1. Install [Eclipse IDE](http://www.eclipse.org/downloads/)

    > Choose Eclipse IDE for Enterprise Java and Web Developers(EE)

    > or download the Eclipse IDE for Enterprise Java and Web Developers via [Eclipse packages](https://www.eclipse.org/downloads/packages/)

2. Download [Tomcat](https://tomcat.apache.org/)

3. Download [jsoup](https://jsoup.org/download)
