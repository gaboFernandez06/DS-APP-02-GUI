package com.example.githubgameproject;
import java.util.ArrayList;
import java.util.Arrays;
    public class GameLogic {
        public static int score;
        public static int rand;
        public static final ArrayList<String> wordList = new ArrayList<>(Arrays.asList(" access Token ", " blame ", " branch ", " clone ", " collaborator ", " commit ", " commit message ", " contributor ", " default branch ", " diff ", " feature branch ", " fetch ", " force push ", " fork ", " issue ", " main ", " merge ", " organization ", " private repository ", " public repository ", " pull ", " pull request ", " push ", " repository ", " upstream "));
       public static final ArrayList<String> defList = new ArrayList<>(Arrays.asList("A token that is used in place of a password when performing Git operations over HTTPS with Git on the command line or the API. Also called a personal access token.", "The blame feature in Git describes the last modification to each line of a file, which generally displays the revision, author and time. This is helpful, for example, in tracking down when a feature was added, or which commit led to a particular bug.", "A branch is a parallel version of a repository. It is contained within the repository, but does not affect the primary or main branch allowing you to work freely without disrupting the live version. When you've made the changes you want to make, you can merge your branch back into the main branch to publish your changes.", "A clone is a copy of a repository that lives on your computer instead of on a website's server somewhere, or the act of making that copy. When you make a clone, you can edit the files in your preferred editor and use Git to keep track of your changes without having to be online. The repository you cloned is still connected to the remote version so that you can push your local changes to the remote to keep them synced when you're online.", "A collaborator is a person with read and write access to a repository who has been invited to contribute by the repository owner.",
                "A commit, or revision, is an individual change to a file (or set of files). When you make a commit to save your work, Git creates a unique ID (a.k.a. the SHA or hash) that allows you to keep record of the specific changes committed along with who made them and when. Commits usually contain a commit message which is a brief description of what changes were made.", "Short, descriptive text that accompanies a commit and communicates the change the commit is introducing.", "A contributor is someone who does not have collaborator access to a repository but has contributed to a project and had a pull request they opened merged into the repository.", "The base branch for new pull requests and code commits in a repository. Each repository has at least one branch, which Git creates when you initialize the repository. The first branch is usually called main, and is often the default branch.", "A diff is the difference in changes between two commits, or saved changes. The diff will visually describe what was added or removed from a file since its last commit.", "A branch used to experiment with a new feature or fix an issue that is not in production. Also called a topic branch.", "When you use git fetch, you're adding changes from the remote repository to your local working branch without committing them. Unlike git pull, fetching allows you to review changes before committing them to your local branch.", "A Git push that overwrites the remote repository with local changes without regard for conflicts. Or, you know, a Star Wars ability.", "A fork is a personal copy of another user's repository that lives on your account. Forks allow you to freely make changes to a project without affecting the original upstream repository. You can also open a pull request in the upstream repository and keep your fork synced with the latest changes since both repositories are still connected.", "Issues are suggested improvements, tasks or questions related to the repository. Issues can be created by anyone (for public repositories), and are moderated by repository collaborators. Each issue contains its own discussion thread. You can also categorize an issue with labels and assign it to someone.", "The default development branch. Whenever you create a Git repository, a branch named main is created, and becomes the active branch. In most cases, this contains the local development, though that is purely by convention and is not required.", "Merging takes the changes from one branch (in the same repository or from a fork), and applies them into another. This often happens as a pull request (which can be thought of as a request to merge), or via the command line. A merge can be done through a pull request via the GitHub.com web interface if there are no conflicting changes, or can always be done via the command line.", "Organizations are a group of two or more users that typically mirror real-world organizations. They are administered by users and can contain both repositories and teams.", "Private repositories are only visible to the repository owner and collaborators that the owner specified.", "A public repository can be viewed by anyone, including people who aren't GitHub users. I mean...did we expect anything else?", "Pull refers to when you are fetching in changes and merging them. For instance, if someone has edited the remote file you're both working on, you'll want to pull in those changes to your local copy so that it's up to date. See also fetch.", "Pull requests are proposed changes to a repository submitted by a user and accepted or rejected by a repository's collaborators. Like issues, pull requests each have their own discussion forum.",
                "To push means to send your committed changes to a remote repository on GitHub.com. For instance, if you change something locally, you can push those changes so that others may access them.", "A repository is the most basic element of GitHub. They're easiest to imagine as a project's folder. A repository contains all of the project files (including documentation), and stores each file's revision history. Repositories can have multiple collaborators and can be either public or private.", "When talking about a branch or a fork, the primary branch on the original repository is often referred to as the upstream, since that is the main place that other changes will come in from. The branch/fork you are working on is then called the downstream.  Also called origin."));
        public static final ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("access Token", "blame", "branch", "clone", "collaborator", "commit", "commit message", "contributor", "default branch", "diff", "feature branch", "fetch", "force push", "fork", "issue", "main", "merge", "organization", "private repository", "public repository", "pull", "pull request", "push", "repository", "upstream"));

        public GameLogic() {
        }

        /* public static void Normal() {
            cardShuffle();
            System.out.println("You finished" + "\n" + "Would you like to see your statistics ? " + " Press Button A for Yes or Press Button B for No ");
            if ()// BUttonA then
            {
                if (score == 25) {
                    System.out.println("Congrats you got Zero wrong");
                } else {
                    int wrong = 25 - score;
                    System.out.println("You got : " + score + " out of 25" + "\n" + "That means you got " + wrong + " wrong ");

                }
            } else {
                if (ButtonB) // Button B is clicked
                {
                    System.out.println("Shame on you");
                }

            }


        }


        public  static void cardShuffle() {

                // prints out in welcometext box
                if () // If button A is clicked
                {
                   welcomeText.setText("YOURE RIGHT !!!!! :)"); // Prints out in welcometext
                    wordList.remove(rand);
                    defList.remove(rand);
                } else {
                    welcomeText.setText("YOUR'E WRONG :( "); // Prints out in welcometext
                    wordList.remove(rand);
                    defList.remove(rand);
                }
            }

         */
    }



