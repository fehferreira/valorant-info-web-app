import React from 'react';
import { createRoot } from 'react-dom/client';

const divElement = document.getElementById('root');
if (divElement) {
	const root = createRoot(divElement);
	root.render(<h1>Hello World!!</h1>);
}
