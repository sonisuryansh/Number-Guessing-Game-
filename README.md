<div align="center">

# 🎮 Java Number Guessing Engine
### *Algorithmic Logic • Randomization • State-Based Gameplay*

<p>
  <img src="https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Logic-Randomized%20Search-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Game_Dev-CLI-success?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Difficulty-Dynamic-orange?style=for-the-badge" />
</p>

---

**[ 🕹️ How to Play ](#-game-mechanics) • [ ✨ Features ](#-core-functionality) • [ ⚙️ Logic Flow ](#-engine-architecture) • [ 📬 Contact ](#-author)**

</div>

---

## 🏛️ Game Mechanics
The game implements a **Binary Search-style** challenge where the user must narrow down a secret value through iterative feedback.



[Image of binary search algorithm diagram]


| Phase | Action | System Feedback |
| :--- | :--- | :--- |
| **Initialize** | Generate `Number` (1-100) | "I'm thinking of a number..." |
| **Input** | User enters Guess | Validation of integer range |
| **Compare** | `Guess` vs `Target` | "Too High" ⬆️ or "Too Low" ⬇️ |
| **Result** | Match or Out of Turns | Points Awarded or Game Over 💀 |

---

## 🚀 Core Functionality

### 🎲 Algorithmic Randomization
Using `java.util.Random`, the engine ensures a unique experience every round. The range is strictly enforced to maintain a balanced difficulty curve.

### 🏆 Scoring & Rounds
* **Attempt Tracking:** A finite "Life" system that adds pressure to every guess.
* **Dynamic Scoring:** Points are calculated as a function of remaining attempts—incentivizing efficiency over trial-and-error.
* **Persistent Sessions:** Multi-round support allowing players to build a cumulative high score.

### 🛠️ Technical Highlights
* **Scanner Optimization:** Robust handling of the console input stream.
* **Conditional Branching:** Precise `if-else` cascades to guide the player toward the correct value.
* **Loop Control:** Nested loops to manage individual rounds vs. the global game session.

---
