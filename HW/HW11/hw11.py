class hw11:
    def floodFill(self, image, sr, sc, newColor):
        if image[sr][sc] == newColor:
            return image
        self.fill(image, sr, sc, image[sr][sc], newColor)
        return image

    def fill(self, image, sr, sc, color, newColor):
        # Check for out of bounds indices
        if sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]):
            return
        
        # Check if the current color is the one we need to change
        if image[sr][sc] == color:
            image[sr][sc] = newColor
            # Recursively call fill() for all adjacent pixels
            self.fill(image, sr + 1, sc, color, newColor)
            self.fill(image, sr - 1, sc, color, newColor)
            self.fill(image, sr, sc + 1, color, newColor)
            self.fill(image, sr, sc - 1, color, newColor)


    # can optimize run time