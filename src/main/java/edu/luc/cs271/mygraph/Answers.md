# Questions & Answers

## Discuss the differences among the results. Does the starting point make a difference?
1. `BreadthFirstIterator` and `DepthFirstIterator` will print reversed results for the same starting vertice.

- Start with "France" <br>
`BreadthFirstIterator` - France
Spain
Italy
Switzerland
Germany
Luxembourg
Belgium <br>
`DepthFirstIterator` - France
Belgium
Luxembourg
Germany
Switzerland
Italy
Spain <br>

- Starting with "Italy". "Spain" is an exception, since it only has one direct neighbour which is "France".  <br>
`BreadthFirstIterator` - Italy
France
Switzerland
Spain
Germany
Luxembourg
Belgium <br>
`DepthFirstIterator` - Italy
Switzerland
Germany
Belgium
Luxembourg
France
Spain

2. `ClosestFirstIterator` will print the same result with `BreadthFirstIterator`.

3. `RandomWalkIterator` will print randomly on all the country names infinitely, no matter what the starting vertice is.

## Give two or three examples of how/why a real-world map might require more than four colors.
1. Enclave: For an example: Vatican City is entirely surrounded by the territory of Italy. Different colors will be used for the two countries and neighbors of Italy.
2. Exclave: For an example: Campione d'Italia, Province of Como, Italy is separated from the main part of Italy and located in the territory of Switzerland. Campoine will be painted the same color with Italy, but different with Switzerland, and neighbors of the two countries.
3. If several countries share the same corner, then more than four colors will be used.
4. Usually the real maps will use more than four colors to show different areas, and for better visual effects.