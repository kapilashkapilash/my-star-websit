// Like Button Functionality
let likeCount = 0;
const likeBtn = document.getElementById("likeBtn");
const likeCountDisplay = document.getElementById("likeCount");

likeBtn.addEventListener("click", () => {
    likeCount++;
    likeCountDisplay.textContent = likeCount;
});

// Share Button Functionality
const shareBtn = document.getElementById("shareBtn");
shareBtn.addEventListener("click", () => {
    const url = window.location.href;
    navigator.clipboard.writeText(url)
        .then(() => alert("URL copied to clipboard! Share it anywhere."))
        .catch(() => alert("Failed to copy the URL."));
});

// Comment Section Functionality
const commentInput = document.getElementById("commentInput");
const postComment = document.getElementById("postComment");
const commentList = document.getElementById("commentList");

postComment.addEventListener("click", () => {
    const commentText = commentInput.value.trim();
    if (commentText) {
        const commentItem = document.createElement("li");
        commentItem.textContent = commentText;
        commentList.appendChild(commentItem);
        commentInput.value = "";
    } else {
        alert("Please enter a comment before posting.");
    }
});
