
#### 一、使用方法

- 下载当前骨架到本地
`git clone 
`
- 构建骨架到本地
`mvn install
`
- 在你要创建工程的文件目录下 执行一下命令，将会在此目录下得到一个新的工程
```
mvn archetype:generate 
    -DarchetypeCatalog=internal
    -DarchetypeArtifactId=rubber-archetype-template-web
    -DarchetypeGroupId=com.rubber 
    -DarchetypeVersion=1.0-SNAPSHOT
    -DgroupId=com.rubber 
    -DartifactId=rubber-at-tennis-atp
    -Dversion=1.0.0-SNAPSHOT 
    -Dpackage=com.rubber.at.tennis
```
- 以上的名词解释
    + "-DarchetypeCatalog=internal" 不要从远程服务器上取catalog。防止卡在 "Generating project in Interactive mode"
    + "-DgroupId" 表示你当前需要生成的项目的 groupId
    + "-DartifactId" 表示你当前需要生成的项目的 artifactId
    + "-Dversion" 表示你当前需要生成的项目的 version
    + "-Dpackage" 表示你当前需要生成的项目的 包跟路径，线下买鸭一般是 com.fenqile.afterpay.offline.**
    + "-DarchetypeArtifactId" 表示选择的骨架模版，当前可选择的
    + "-DarchetypeGroupId" 表示选择的骨架模版的GroupId,  当前项目骨架id都是 "com.fenqile"
    + "-DarchetypeVersion" 表示选择骨架模版的Version,  当前项目骨架Version都是 "1.0.0-SNAPSHOT"

#### 二、可能遇到的问题
- 执行之后生成的工程代码，中文乱码问题，可以参考以下方法解决 https://www.codeleading.com/article/25734902354/


```
mvn archetype:generate  -DarchetypeCatalog=internal -DarchetypeArtifactId=rubber-archetype-template-server -DarchetypeGroupId=com.archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=com.rubber -Dversion=1.0.0-SNAPSHOT -Dpackage=com.rubber.at.tennis -DartifactId=rubber-at-tennis-atp
```

