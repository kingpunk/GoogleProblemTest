The Goal is to maximize per team the number of different ingredient used per pizza.

My Understanding:
- Per team ( 2 or 3 or 4) give maximum number of different ingredient used per pizza.
- Each team ordered one pizza per team * important 
- pizzas should be delivered per person of a team
- error to send 3 pizzas to a 4 person team.
- Once one pizza is delivered to any one of the team it cannot be delivered to other team
- In example given in document name "practice_round_2021" at page number 3 & 4 there are total 4 teams and total 5 pizzas
- 4 teams consist of 1 team of two, 2 team of three & 1 team of four
- only 2 teams will get the pizza
	- that is 2 person team(1 team of two) will get pizza 1 and pizza 4
	- 3 person team(1 out of 2 team of 3 person team) will get pizza 0 pizza 2 and pizza 3
- team which will not receive pizza are 
	- 1 team of three person 
	- 1 team of four person.


Condition Criteria 
1. 1 pizza per person in team compulsory if any one team member is left without pizza that team will not get pizza.
2. Once one pizza is delivered it cant be delivered again to a different team.
3. maximum number of ingredient per team.

Things to Do -( [x] - attempted/completed, [ ] - not attempted/completed yet)
- [x] Delivered flag in pizza object
- [x] Complete classes of teams
	- [x] total number of team members per team
	- [x] flag if all team members  received pizza
	- [x] array to hold pizza index value to identify which team received which pizza.
- [ ] Sort pizza array object based on total number of ingredient
- [ ] Deliver pizza to team.