# DesignExercise3b

## Data
###### All information is verified as valid and only typed once
###### Applications are put in database in submission time order (FIFO)
###### Application contains a person's name and home address

## Review Approval Criteria
###### Application number must be under the limit number. For example, limit number is 50, limting only 50 people can transit -> application number must be <= 50 to be considered
###### Name and home address must be not null
###### If satify both criterias -> approved
###### If not satify any critea -> not approved

## Search first name 
###### Name contains first name and last name. Many people can have the same first name -> when return information, it returns the information of all people having the first name being searched
