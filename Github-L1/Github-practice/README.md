# Github-practice
# git stash

git stash temporarily shelves (or stashes) changes you've made to your working copy so you can work on something else, and then come back and re-apply them later on. 

The git stash command takes your uncommitted changes (both staged and unstaged), saves them away for later use, and then reverts them from your working copy. For example:
```
$ git status
On branch main
Changes to be committed:

    new file:   style.css

Changes not staged for commit:

    modified:   index.html

$ git stash
Saved working directory and index state WIP on main: 5002d47 our new homepage
HEAD is now at 5002d47 our new homepage

$ git status
On branch main
nothing to commit, working tree clean
```

# Re-applying your stashed changes

```
$ git stash pop
```

# clear stash 
```
$ git stash clear
```
# logs the commits
```
$ git log
```
# unstaged the commits
```
$ git reset "commit hash"
```

# Branching

# Create new Branch

```
git branch "branch-name" 
```

# Switch to another branch

```
git checkout "branch-name"
```

