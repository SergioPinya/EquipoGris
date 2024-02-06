const getData = async (url) => {
  try {
    const response = await fetch(url);
    if (response.ok) return await response.json();
  } catch (error) {
    return console.log(error);
  }
};

export default getData;
