# Questions & Answers

## Discuss the differences among the results. Does the starting point make a difference?
`BreadthFirstIterator` and `DepthFirstIterator` will print reversed results for the same starting vertice.

- Start with "France" <br>
France
Spain
Italy
Switzerland
Germany
Luxembourg
Belgium <br>
France
Belgium
Luxembourg
Germany
Switzerland
Italy
Spain <br>

- Starting with "Italy". "Spain" is an exception, since it only has one direct neighbour which is "France".
Italy
France
Switzerland
Spain
Germany
Luxembourg
Belgium <br>
Italy
Switzerland
Germany
Belgium
Luxembourg
France
Spain

## Give two or three examples of how/why a real-world map might require more than four colors.