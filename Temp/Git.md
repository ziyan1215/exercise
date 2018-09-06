#常用命令
commit后提交了但未推送给远程仓库时可以用git log查看各个commit的哈希码，然后回滚到相应的点
`git reset --hard e5746d40e9a021f0de96a0f60dc85de95e95da83`
HEAD is now at e5746d4 第一次提交


git clone git@github.com:ziyan1215/exercise  克隆远程库
查看用户名
git config user.name 
查看邮箱
git config user.email
修改用户名和邮箱
git config --global user.name "username"
git config --global user.email "email"
显示远程信息
git remote show origin
 * remote origin
  Fetch URL: git@github.com:ziyan1215/exercise
  Push  URL: git@github.com:ziyan1215/exercise
  HEAD branch: master
  Remote branch:
    master tracked
  Local branch configured for 'git pull':
    master merges with remote master
  Local ref configured for 'git push':
    master pushes to master (up to date)