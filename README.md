# GitHubLanguageCount-MapReduce
This application pulls repo data from github using GitHub Api, This can effectively calculate the number of times each language is used 
in an accounts repositories.

API USED : https://docs.github.com/en/rest/quickstart?apiVersion=2022-11-28

Command to run Hadoop : Hadoop jar target/sample-1.0-SNAPSHOT.jar com.mr.GitHubRepoCounter [Input File PATH] [Output File]
